package com.omerozturk.N11GraduationProject.crd.entities.dtos;


import com.omerozturk.N11GraduationProject.gen.utilities.enums.EnumStatus;
import lombok.Data;

import java.util.Date;

@Data
public class CrdCreditDto {

    private Long id;
    private String name;
    private String shortName;
    private String explanation;
}
