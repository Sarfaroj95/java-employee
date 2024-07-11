package com.restapiproject.rest_demo.service.impl;

import com.restapiproject.rest_demo.model.CloudVendor;
import com.restapiproject.rest_demo.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CloudVendorServiceImpl implements CloudVendorService {

    @Autowired
    CloudVendorRepository cloudVendorRepository;


    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
//        Its test code push
        return null;

    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        return null;
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
