package com.exam.carapp.requests.byingRequests.service;

import com.exam.carapp.requests.byingRequests.model.BuyingRequest;
import com.exam.carapp.requests.byingRequests.model.RequestError;

import java.util.List;

public interface BuyingRequestsService {
    List<BuyingRequest> getAll();
    List<BuyingRequest> getByCarId(Integer carId);
    List<BuyingRequest> getByUserId(Integer userId);
    boolean updateStatus(String status, Integer id);
    BuyingRequest getById(Integer id);
    RequestError createRequest(BuyingRequest request);
}
