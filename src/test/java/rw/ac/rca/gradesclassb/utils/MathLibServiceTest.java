package rw.ac.rca.gradesclassb.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testng.Assert;
import rw.ac.rca.gradesclassb.models.MathLib;
import rw.ac.rca.gradesclassb.repositories.MathLibRepository;
import rw.ac.rca.gradesclassb.services.impl.MathLibServiceImpl;

import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
public class MathLibServiceTest {

    @Mock
    MathLibRepository mathLibRepository;
    @InjectMocks
    private MathLibServiceImpl mathLibService;

    @Test void save_mathLib(){
        MathLib mathLib = new MathLib(1, 2, 2);
        mathLib.setSum(4);
        mathLib.setProduct(4);
        MathLib mathLib1 = new MathLib(1,2,2);

        when(mathLibRepository.save(mathLib1)).thenReturn(mathLib);
        Assert.assertEquals(mathLib,mathLibRepository.save(mathLib1));
    }

}