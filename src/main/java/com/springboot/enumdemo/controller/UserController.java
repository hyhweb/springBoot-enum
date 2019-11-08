package com.springboot.enumdemo.controller;

import com.springboot.enumdemo.common.enums.Color;
import com.springboot.enumdemo.common.enums.Type;
import javafx.scene.media.MediaException;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  public static void main(String[] args) {
      System.out.println(Color.getName(1));

      for(Color c :Color.values()){
      System.out.println("index:"+c.getIndex()+"----------name:"+c.getName()+"-----ordinal:"+c.ordinal());
      }

    for (Type t : Type.values()) {
        System.out.println("----------name:"+t+"-----ordinal:"+t.ordinal());
    }
      //
  }
}
