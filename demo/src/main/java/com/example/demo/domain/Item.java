package com.example.demo.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

public class Item {
    @Getter
    @Setter
    private Long id;

    @NotBlank(message="商品名を記入してください")
    @Getter
    @Setter
    private String name;

    @Min(value=10, message = "10以上の数値を入力")
    @Max(value=10000, message = "10000以下の数値を入力")
    @Getter
    @Setter
    private float price;

    @Size(max=50, message="ベーダー名は50文字を超えないでください")
    @Getter
    @Setter
    private String vendor;
}