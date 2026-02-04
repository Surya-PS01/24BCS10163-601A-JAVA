package Experiment2;

import java.util.*;

abstract class EvaluationSoftware {

    Program program;
    List<ModerationRule> rules = new ArrayList<>();

    EvaluationSoftware(Program p){
        program=p;
    }

    void addRule(ModerationRule r){
        rules.add(r);
    }

    void evaluate(Student s){

        for(ModerationRule r:rules)
            r.apply(s);

        int marks=program.finalMarks(s);
        String g=program.grade(marks);

        System.out.println(s.name+" -> "+marks+" -> "+g);
    }
}
