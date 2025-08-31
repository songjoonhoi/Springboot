package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor // hello, lombok 속성에 final을 추가하고 @Re~ 어노테이션을 적용하면 생성자가 롬복에 의해 자동으로 생성됨
@Getter
@Setter
public class HelloLombok {
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("안뇽 이홍시", 5);
        // helloLombok.setHello("이홍시 안뇽");
        // helloLombok.setLombok(5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
