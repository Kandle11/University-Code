import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopyUtil {

    public long copyByByte(String srcPath, String destPath) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        long startTime = System.currentTimeMillis();

        try {
            fis = new FileInputStream(srcPath);
            fos = new FileOutputStream(destPath);
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long copyByBuffer(String srcPath, String destPath) throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        long startTime = System.currentTimeMillis();

        try {
            bis = new BufferedInputStream(new FileInputStream(srcPath));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.flush();
        } finally {
            if (bis != null) {
                bis.close();
            }
            if (bos != null) {
                bos.close();
            }
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}

public class IODemo {
    public static void main(String[] args) {
        FileCopyUtil util = new FileCopyUtil();
        String sourceFile = "source.jpg";
        String destByte = "copy_byte.jpg";
        String destBuffer = "copy_buffer.jpg";

        try {
            System.out.println("=== 文件复制性能测试 ===");
            System.out.println("源文件: " + sourceFile);

            long byteTime = util.copyByByte(sourceFile, destByte);
            System.out.println("逐字节复制耗时: " + byteTime + " ms");

            long bufferTime = util.copyByBuffer(sourceFile, destBuffer);
            System.out.println("缓冲流批量复制耗时: " + bufferTime + " ms");

            if (byteTime > bufferTime) {
                double ratio = (double) byteTime / bufferTime;
                System.out.println("缓冲流效率是逐字节方式的 " + String.format("%.1f", ratio) + " 倍");
            } else {
                System.out.println("两种方式耗时接近");
            }

        } catch (IOException e) {
            System.err.println("文件操作出错: " + e.getMessage());
            e.printStackTrace();
        }
    }
}