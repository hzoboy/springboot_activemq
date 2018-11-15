package com.cictec.activemq.activemq;

import org.apache.activemq.command.ActiveMQMapMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :zoboy
 * @Description:
 * @ Date: Created in 2018-09-13 13:44
 */
@Component
public class MessageHandler {
    volatile int count = 0;
    static Logger logger = LoggerFactory.getLogger(MessageHandler.class);

    @JmsListener(destination = "tpc.out.cic", containerFactory = "topicListenerContainer")
    public void recieve2(Message message) {
        ActiveMQMapMessage mapMessage = (ActiveMQMapMessage) message;
        try {
            Map<String, Object> headerMap = mapMessage.getProperties();
            Map<String, Object> bodyMap = mapMessage.getContentMap();
            //        Map<String, String> dataMap = new HashMap<>();
//        dataMap.put("cityCode", cityCode);
//        dataMap.put("busPlate", headerMap.get(Constants.HED_BUS_PALTE).toString());
//        dataMap.put("lineName", bodyMap.get(Constants.MSG_INFO_POSITION_LINE_NAME).toString());
//        dataMap.put("gpsTime", CictecDateUtil.parseDate(headerMap.get(Constants.HED_UPLOAD_TIME).toString(), "").getTime() + "");
//        dataMap.put("systemTime", new Date().getTime() + "");
//        dataMap.put("positionBusStatus", bodyMap.get(Constants.MSG_INFO_POSITION_BUS_STATUS) + "");
//        dataMap.put("standbyFlag", bodyMap.get(Constants.MSG_INFO_POSITION_STANDBY_FLAG) + "");
//        dataMap.put("enterOutSation", bodyMap.get(Constants.MSG_INFO_POSITION_ENTER_OUT_SATION) + "");
//        dataMap.put("loginStatus", bodyMap.get(Constants.MSG_INFO_LOGIN_STATUS) + "");
//        dataMap.put("stationSeq", bodyMap.get(Constants.MSG_INFO_POSITION_STATION_SEQ) + "");
//        dataMap.put("direction", bodyMap.get(Constants.MSG_INFO_POSITION_DIRECTION) + "");
//        dataMap.put("positionRate", bodyMap.get(Constants.MSG_INFO_POSITION_RATE) + "");
//        dataMap.put("lat", bodyMap.get(Constants.MSG_INFO_POSITION_LATITUDE) + "");
//        dataMap.put("lng", bodyMap.get(Constants.MSG_INFO_POSITION_LONGITUDE) + "");
//        dataMap.put("index", CompareConstant.ORIGINALDATAINDEXNAME);
            System.out.println(headerMap);
            System.out.println(bodyMap);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JMSException e) {
            e.printStackTrace();
        }




    }
}
