package com.restapiproject.rest_demo.controller;


import com.restapiproject.rest_demo.model.CloudVendor;
import com.restapiproject.rest_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController
{

    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }



    @GetMapping("{vendorId}")
    public CloudVendor getCloudVenderDetails(@PathVariable("vendorId") String vendorId)
    {
        return  cloudVendorService.getCloudVendor(vendorId);
        //  new CloudVendor("C1", "Vendor 1", "Address 1", "1234567890");

    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVenderDetails()
    {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
//        this.cloudVendor = cloudVendor;
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud vendor created successfully";
    }


    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
//        this.cloudVendor = cloudVendor;
        return "Cloud vendor update successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
//        this.cloudVendor = null;
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor delete successfully";
    }
}
