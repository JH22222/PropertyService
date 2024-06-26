package com.propertyservice.propertyservice.controller;

import com.propertyservice.propertyservice.domain.common.Response;
import com.propertyservice.propertyservice.domain.common.ResponseCode;
import com.propertyservice.propertyservice.dto.property.PropertyForm;
import com.propertyservice.propertyservice.dto.property.PropertyIdForm;
import com.propertyservice.propertyservice.service.PropertyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/property")
public class PropertyController {
    private final PropertyService propertyService;

    /**
     * 매물 등록
     *
     * @param propertyForm
     * @return
     */
    @PostMapping("/v1/property")
    public Response createProperty(@RequestBody @Valid PropertyForm propertyForm) {
        try {
            propertyService.createProperty(propertyForm);
            return new Response(ResponseCode.SUCCESS, null, "200");
        } catch (Exception e) {
            return new Response(ResponseCode.FAIL, e.getMessage(), "400");
        }
    }


    /**
     * 매물 조회
     *
     * @param propertyId
     * @return
     */
    @GetMapping("/v1/property/{propertyId}")
    public Response searchProperty(@PathVariable(name = "propertyId") Long propertyId) {
        try {
            return new Response(ResponseCode.SUCCESS, propertyService.searchProperty(propertyId), "200");
        } catch (Exception e) {
            return new Response(ResponseCode.FAIL, e.getMessage(), "400");
        }
    }

    /**
     * 매물 수정
     *
     * @param propertyForm
     * @param bindingResult
     * @return
     */
    @PutMapping("/v1/property")
    public Response updateProperty(@RequestBody @Valid PropertyForm propertyForm, BindingResult bindingResult) {
        try {
            return new Response(ResponseCode.SUCCESS, propertyService.updateProperty(propertyForm), "200");
        } catch (Exception e) {
            return new Response(ResponseCode.FAIL, e.getMessage(), "400");
        }
    }

    /**
     * 매물 삭제
     *
     * @param propertyIdForm
     * @return
     */
    @DeleteMapping("/v1/property")
    public Response deleteProperty(@RequestBody @Valid PropertyIdForm propertyIdForm) {
        try {
            propertyService.deleteProperty(propertyIdForm);
            return new Response(ResponseCode.SUCCESS, null, "200");
        } catch (Exception e) {
            return new Response(ResponseCode.FAIL, e.getMessage(), "400");
        }
    }

}
