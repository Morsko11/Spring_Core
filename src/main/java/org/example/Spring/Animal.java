package org.example.Spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
@AllArgsConstructor

public abstract class  Animal  {

    public abstract void makeVoice();


}
