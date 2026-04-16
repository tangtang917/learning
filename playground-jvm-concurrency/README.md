# playground-jvm-concurrency

## 模块目标
练 JVM、线程基础、锁、线程池、CAS、AQS 和 `CompletableFuture`，建立对“异步和并发”这条后端主线的直觉。

## 学习范围
- JVM 内存、GC、类加载
- 线程与线程安全
- `synchronized`、`volatile`、`Lock`
- 线程池
- `CompletableFuture`
- CAS、AQS、并发容器

## 包结构说明
- `jvm.memory`：JVM 内存结构练习包，适合理解堆、栈、方法区。
- `jvm.gc`：垃圾回收练习包，适合理解 GC 行为和参数。
- `jvm.classloading`：类加载练习包，适合理解类加载流程和双亲委派。
- `thread`：线程基础练习包，放线程创建、启动、中断、状态实验。
- `synchronizeddemo`：`synchronized` 关键字实验包。
- `volatiledemo`：`volatile` 关键字实验包。
- `lock`：显示锁练习包，比如 `ReentrantLock`、读写锁。
- `threadpool`：线程池练习包，放参数配置、拒绝策略、任务提交实验。
- `completablefuture`：异步编排练习包，放 `CompletableFuture` 链式调用示例。
- `cas`：CAS 机制练习包。
- `aqs`：AQS 练习包，理解锁和同步器底层思想。
- `concurrentcollection`：并发容器练习包，比如 `ConcurrentHashMap`、阻塞队列。

## 学习资源
- [内部资源清单](../docs/resources/concurrency.md)
- [JavaGuide JVM 专题](https://javaguide.cn/java/jvm/)
- [Java 并发常见面试题](https://javaguide.cn/java/concurrent/java-concurrent-questions-01.html)

## 练习任务
- [ ] 每种并发机制至少写一个最小示例
- [ ] 自己总结线程池参数配置策略
- [ ] 对 `CompletableFuture` 写链式调用实验

## 笔记区
- 常考点：
- 真实理解：
- 仍有疑问：

## 完成状态
- 状态：未开始
