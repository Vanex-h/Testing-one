package rw.ac.rca.gradesclassb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.ac.rca.gradesclassb.models.MathLib;
import rw.ac.rca.gradesclassb.repositories.MathLibRepository;

@Service
public class MathLibServiceImpl {
    @Autowired
    private MathLibRepository mathLibRepository;

    public MathLib save(Integer number1, Integer number2) {
        MathLib mathLib = new MathLib();
        mathLib.setNumber1(number1);
        mathLib.setNumber2(number2);
        mathLibRepository.save(mathLib);

        mathLib.setSum(number1+number2);
        mathLib.setProduct(number1*number2);

        return mathLib;
    }
}