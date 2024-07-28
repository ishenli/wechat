package com.workdance.chatbot.ui.main.dashboard;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.workdance.chatbot.api.ChatClient;
import com.workdance.chatbot.api.dto.req.ChatReq;
import com.workdance.chatbot.model.Assistant;

import java.util.List;

public class AssistantListViewModel extends ViewModel {

    MutableLiveData<List<Assistant>> assistantList = new MutableLiveData<>();
    public void loadAssistantList(String userId) {
        ChatReq chatReq = new ChatReq();
        chatReq.setUserId(userId);
        ChatClient.getAllAssistant(chatReq).observeForever(assistantList::setValue);
    }

    public MutableLiveData<List<Assistant>> getAssistantList() {
        return assistantList;
    }
}
