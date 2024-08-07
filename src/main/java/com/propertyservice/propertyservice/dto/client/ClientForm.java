package com.propertyservice.propertyservice.dto.client;

import com.propertyservice.propertyservice.domain.property.Property;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClientForm {

    private String clientName; // 고객이름
    private Long inflowTypeId; // 유입경로
    private String clientPhoneNumber; // 고객번호
    private Long managerId; // 담당 매니저
    private String remark; //특이사항 작성 후 저장.

    private List<Property> propertyList;// 보여줄 매물 리스트.
}
