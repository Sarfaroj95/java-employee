package com.restapiproject.rest_demo.repository.CloudVendor;

import com.restapiproject.rest_demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<CloudVendor, String> {
}
