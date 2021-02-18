package complicate;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/4 下午3:14
 * @Description:
 */
public class xiancheng {

    public static void main(String[] args) {

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo: threadInfos) {
            System.out.println(threadInfo.getThreadId() + "   " +threadInfo.getThreadName());
        }
    }
}

// 如果将运货单抽象 class
// 地址 class
// 编号 id
//