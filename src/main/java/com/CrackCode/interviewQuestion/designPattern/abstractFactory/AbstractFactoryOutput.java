package com.CrackCode.interviewQuestion.designPattern.abstractFactory;

import com.CrackCode.interviewQuestion.designPattern.abstractFactory.agamisoft.AgamiSoftDeveloper;
import com.CrackCode.interviewQuestion.designPattern.abstractFactory.crackCode.CrackCodeDeveloper;

public class AbstractFactoryOutput {
    public static void main(String[] args) {
        AgamiSoftDeveloper agamiSoftDeveloper = new BusinessAutomation().create("Backend Developer");
        System.out.printf(agamiSoftDeveloper.addNewDeveloper("Backend Developer"));

        AgamiSoftDeveloper agamiSoftDeveloper1 = new BusinessAutomation().create("Backend Developer");
        System.out.printf("\n\n");
        System.out.printf(agamiSoftDeveloper1.addNewDeveloper("Backend Developer"));
        System.out.printf("\n\n");
        /**
         * For Crack Code
         */
        CrackCodeDeveloper crackCodeDeveloper = new  BusinessAutomation().createInCrackCode("CTO");
        System.out.printf(crackCodeDeveloper.crackCodeDeveloperName());
        System.out.printf("\n\n");

        CrackCodeDeveloper crackCodeDeveloper2 = new  BusinessAutomation().createInCrackCode("Marketing Manager");
        System.out.printf(crackCodeDeveloper2.crackCodeDeveloperName());


    }
}
