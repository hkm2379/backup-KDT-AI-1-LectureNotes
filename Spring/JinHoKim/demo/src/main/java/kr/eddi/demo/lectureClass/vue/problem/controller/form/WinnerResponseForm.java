package kr.eddi.demo.lectureClass.vue.problem.controller.form;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class WinnerResponseForm {

    private final Integer winnerNumber;
    private final String result;
}
