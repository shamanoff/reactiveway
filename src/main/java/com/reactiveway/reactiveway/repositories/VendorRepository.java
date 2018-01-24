package com.reactiveway.reactiveway.repositories;

import com.reactiveway.reactiveway.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
