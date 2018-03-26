package com.learning.localization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class MessagesImpl {

    @Autowired
    private MessageSource messageSource;
    private MessageSourceAccessor accessor;

    @RequestMapping(value = "/getmessages", method = RequestMethod.POST)
    private String messageAccess() {
        accessor = new MessageSourceAccessor(messageSource);
        return accessor.getMessage(new Integer(100).toString());

    }
}