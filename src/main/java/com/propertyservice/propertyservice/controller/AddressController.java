package com.propertyservice.propertyservice.controller;

import com.propertyservice.propertyservice.domain.response.Response;
import com.propertyservice.propertyservice.domain.response.ResponseCode;
import com.propertyservice.propertyservice.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AddressController {

    private final AddressService addressService;

    /**
     * 시/도 주소 목록 조회
     *
     * @return
     */
    @GetMapping("/v1/address-level1-list")
    public Response getAddressLevel1List() {
        try {
            return new Response(ResponseCode.SUCCESS, addressService.getAddressLevel1List(), "200");
        } catch (Exception e) {
            return new Response(ResponseCode.FAIL, e.getMessage(), "400");
        }
    }

    /**
     * 시/구/동 주소 목록 조회
     *
     * @param addressLevel1Id
     * @return
     */
    @GetMapping("/v1/address-level2-list/{addressLevel1Id}")
    public Response getAddressLevel2List(@PathVariable("addressLevel1Id") Long addressLevel1Id) {
        try {
            return new Response(ResponseCode.SUCCESS, addressService.getAddressLevel2List(addressLevel1Id), "200");
        } catch (Exception e) {
            return new Response(ResponseCode.FAIL, e.getMessage(), "400");
        }
    }
}