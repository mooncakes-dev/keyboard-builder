package com.keyboardbuilder.enterprise;

import com.keyboardbuilder.enterprise.dao.IKeyboardBuildDAO;
import com.keyboardbuilder.enterprise.dto.KeyboardBuild;
import com.keyboardbuilder.enterprise.services.IKeyboardBuildService;
import com.keyboardbuilder.enterprise.services.KeyboardBuildServiceStub;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
class EnterpriseApplicationTests {


    private IKeyboardBuildService keyboardBuildService;
    private KeyboardBuild keyboardBuild = new KeyboardBuild();

    @MockBean
    private IKeyboardBuildDAO keyboardBuildDAO;

    @Test
    void contextLoads() {
    }

    @Test
    void fetchKeyboardBuildByID_returnsPonoBuildForID1() throws Exception{
        givenKeyboardBuildDataAreAvailable();
        whenSearchKeyboardBuildWithID1();
        thenReturnOnePonoBuildForID1();
    }

    private void givenKeyboardBuildDataAreAvailable() throws Exception{
        Mockito.when(keyboardBuildDAO.save(keyboardBuild)).thenReturn(keyboardBuild);
        keyboardBuildService = new KeyboardBuildServiceStub(keyboardBuildDAO);
    }

    private void whenSearchKeyboardBuildWithID1() {
        keyboardBuild = keyboardBuildService.fetchById(1);
    }

    private void thenReturnOnePonoBuildForID1() {
        String keyCaps = keyboardBuild.getKeyCaps();
        assertEquals("Pono", keyCaps);
    }

    @Test
    void saveKeyboardBuild_validateReturnKeyboardBuild() throws Exception{
        givenKeyboardBuildDataAreAvailable();
        whenUserCreatesNewBuildAndSaves();
        thenCreateNewBuildRecordAndReturnIt();
    }

    private void whenUserCreatesNewBuildAndSaves() {
        keyboardBuild.setKeySwitches("Sakura");
        keyboardBuild.setLayout(65);
    }

    private void thenCreateNewBuildRecordAndReturnIt() throws Exception{
        KeyboardBuild createdBuild = keyboardBuildService.save(keyboardBuild);
        assertEquals(keyboardBuild, createdBuild);
        verify(keyboardBuildDAO, atLeastOnce()).save(keyboardBuild);
    }


}
