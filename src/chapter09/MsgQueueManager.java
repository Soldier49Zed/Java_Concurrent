package chapter09;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

/**
 * @Author: HouX
 * @Date: 2020/12/26
 * @Description: 总消息队列管理
 */
public class MsgQueueManager {

    /**
     * 消息总队列
     */
    public final BlockingQueue<Message> messageQueue;

    private MsgQueueManager(){
        messageQueue = new LinkedTransferQueue<Message>();
    }

    public void put(Message msg){
        try {
            messageQueue.put(msg);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }

    public Message take(){
        try {
            return messageQueue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return null;
    }
}
