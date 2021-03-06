package flashGetter.downloader.task;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.ImageIcon;

/**
 * @author decaywood
 * 
 * 2015年2月6日
 * 
 */
public interface DownloadingTask extends Task {
    
    public double getProgress();
    
    public String getRemainTime();
    
    public double getDownloadSpeed();
    
    public String getFinishTime();
    
    public String getCreateTime();
    
    public long getStartOffset();
    
    public String getDownloadURL();
    
    public String getSavePath();
    
    public String getFileName();
    
    public long getFileSize();
    
    public ImageIcon getFileType();
    
    public void copyInfo(DownloadingTask task);
    
    public void serializeTask() throws IOException ;
    
    public File getTempFilePath();
    
    public void lock();
    
    public void unLock();
    
    public boolean isLock();
    
    public void moveProgress(double progress);
    
    public void setRemainTime(String remainTime);
    
    public void setDownloadSpeed(double speed);
    
    public void setFinishTime(String finishTime);
    
    public void setCreateTime(String createTime);
    
    public void moveStartOffset(long phase);
    
    public void setDownloadURL(String url);
    
    public void setSavePath(String savePath);
    
    public void setFileName(String fileName);
    
    public void setFileSize(long fileSize);
    
    public void setFileType(ImageIcon fileType);
    
}
