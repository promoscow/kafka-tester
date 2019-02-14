package ru.xpendence.karfatester.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.02.19
 * Time: 18:52
 * e-mail: vyacheslav.chernyshov@stoloto.ru
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StarshipDto extends AbstractDto {

    private String name;
    private String model;

    public StarshipDto(String name) {
        this.name = name;
    }
}
