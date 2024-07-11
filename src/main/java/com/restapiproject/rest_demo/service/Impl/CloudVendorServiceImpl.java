package com.restapiproject.rest_demo.service.Impl;

import com.restapiproject.rest_demo.repository.CloudVendorRepository;
import com.restapiproject.rest_demo.model.CloudVendor;
import com.restapiproject.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        //  More Business logic
        cloudVendorRepository.save(cloudVendor);
        return "Create success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More Business logic
        cloudVendorRepository.save(cloudVendor);
        return "Update success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        //  More Business logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Delete Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        //  More Business logic
        return  cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        //  More Business logic
        return cloudVendorRepository.findAll();
    }
}
