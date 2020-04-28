查看java默认启动参数
----
java -XX:+PrintCommandLineFlags -version
默认是：
 -XX:InitialHeapSize=130686272 -XX:MaxHeapSize=2090980352 -XX:+UseCompressedClassPointers
 -XX:+UseCompressedOops -XX:+UseParallelGC 

查看java-jvm虚拟机内存分配情况
----
java -XX:+PrintGCDetails -version
可推测出垃圾收集器的类型
Heap
 PSYoungGen      total 37888K, used 2621K [0x00000000d6700000, 0x00000000d9100000, 0x0000000100000000)
  eden space 32768K, 8% used [0x00000000d6700000,0x00000000d698f790,0x00000000d8700000)
  from space 5120K, 0% used [0x00000000d8c00000,0x00000000d8c00000,0x00000000d9100000)
  to   space 5120K, 0% used [0x00000000d8700000,0x00000000d8700000,0x00000000d8c00000)
 ParOldGen       total 86016K, used 0K [0x0000000083400000, 0x0000000088800000, 0x00000000d6700000)
  object space 86016K, 0% used [0x0000000083400000,0x0000000083400000,0x0000000088800000)
 Metaspace       used 3815K, capacity 4554K, committed 4864K, reserved 1056768K
  class space    used 378K, capacity 386K, committed 512K, reserved 1048576K

开启cms垃圾收集器
----
-XX:+UseConcMarkSweepGC
-XX:+UseCMSCompactAtFullCollection

博文
----
https://www.cnblogs.com/hongdada/p/10277782.html
https://blog.csdn.net/ncuzengxiebo/article/details/83832576
https://www.cnblogs.com/onmyway20xx/p/6605324.html
https://blog.csdn.net/laomumu1992/article/details/82705889
https://segmentfault.com/a/1190000021453229
https://blog.csdn.net/lqp276/article/details/52249438
https://www.javatt.com/p/47329
https://www.cnblogs.com/xuanyuan/p/12467264.html
https://www.jianshu.com/p/2ac72f4342c7
https://lotabout.me/2015/write-a-C-interpreter-2/


























