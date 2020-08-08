package com.example.demo;public class Hello {
  public static void main(String[] argv) {
    com.example.demo.HelloWorld service = new HelloWorldService().getHelloWorldPort();
    //invoke business method
    String x = service.sayHelloWorldFrom("Oanh");

    System.out.println(x);
  }
}
