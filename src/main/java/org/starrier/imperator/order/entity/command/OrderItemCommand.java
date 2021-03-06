package org.starrier.imperator.order.entity.command;

import lombok.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author starrier
 * @date 2021/1/14
 */
@Value
public class OrderItemCommand {

    @NotBlank(message = "产品ID不能为空")
    String productId;

    @Min(value = 1, message = "产品数量必须大于0")
    int count;

    @NotNull(message = "产品单价不能为空")
    BigDecimal itemPrice;

}