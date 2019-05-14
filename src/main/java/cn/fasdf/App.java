package cn.fasdf;

import org.csource.fastdfs.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        //1.加载配置文件
        ClientGlobal.init("E:\\ide.namespace\\fastDemo\\src\\main\\resources\\fdfs_client.conf");
        //2.//构建客户端
        TrackerClient client = new TrackerClient();
        //3.等到服务端对象
        TrackerServer trackerServer =client.getConnection();
        //4.声明存储的服务端
        StorageServer storageServer =null;
        //创建客服端(存储服务器的客户端)
        StorageClient storageClient =new StorageClient(trackerServer,storageServer);
        //上传文件
        String[] strings = storageClient.upload_file("D:\\v.jpg", "jpg", null);
        for (String str:strings
             ) {
            System.out.println(str);
        }


    }
}
