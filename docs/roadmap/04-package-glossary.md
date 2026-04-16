# 包结构中文说明

这份文档专门用来解释各个模块下英文包名的中文含义，方便你后面看目录时能立刻知道“这个包是做什么的”。

## 通用分层包

这些包会在多个 Spring Boot 模块里重复出现，含义基本一致。

- `controller`：控制层，也可以理解为接口层。负责接收 HTTP 请求、参数转换、调用业务层并返回结果。
- `service`：业务层接口。定义“这个模块要提供哪些业务能力”。
- `service.impl`：业务层实现。把 `service` 里定义的能力真正实现出来。
- `dto`：数据传输对象。通常表示“请求进来时使用的数据结构”，比如新增用户请求、修改商品请求。
- `vo`：视图对象。通常表示“返回给前端或调用方的数据结构”。
- `entity`：实体对象。通常对应数据库表结构，适合在 MyBatis 或数据库相关模块里使用。
- `mapper`：数据访问层。负责和数据库交互，写 SQL 映射或接口定义。
- `config`：配置包。放 Spring 配置类、线程池配置、Redis 配置、Quartz 配置之类的内容。
- `exception`：异常包。放自定义异常和全局异常处理相关代码。
- `util`：工具包。放一些通用帮助方法，但要克制，避免把业务逻辑塞进去。
- `model`：模型包。通常放消息模型、任务模型、配置模型这类中间对象。
- `validator`：校验包。放 cron 校验、参数规则校验、自定义校验器。
- `listener`：监听器包。通常用于监听异步事件、应用事件或消息回调。
- `task`：任务包。放异步任务、调度任务、后台处理任务。

## `playground-java-basics`

- `oop`：面向对象练习包。放封装、继承、多态、抽象类、接口相关示例。
- `collection`：集合练习包。放 `List`、`Set`、`Map` 以及遍历、排序等实验。
- `generic`：泛型练习包。放泛型类、泛型方法、通配符等示例。
- `exception`：异常练习包。放异常分类、自定义异常、异常处理流程示例。
- `reflection`：反射练习包。放获取类信息、调用方法、读取字段等实验。
- `io`：传统 IO 练习包。放字节流、字符流、文件读写等内容。
- `nio`：NIO 练习包。放 `Buffer`、`Channel`、`Path` 等内容。
- `lambda`：Lambda 表达式练习包。放函数式接口、简化写法示例。
- `stream`：Stream 流式处理练习包。放过滤、映射、聚合、分组等操作。

## `playground-algorithm`

- `array`：数组题练习包。
- `linkedlist`：链表题练习包。
- `stackqueue`：栈和队列题练习包。
- `hashmap`：哈希表相关题练习包。
- `tree`：二叉树、树遍历、树结构题练习包。
- `recursion`：递归与回溯题练习包。
- `sort`：排序算法练习包。
- `search`：查找算法练习包。

## `playground-jvm-concurrency`

- `jvm.memory`：JVM 内存结构练习包，比如堆、栈、方法区等理解实验。
- `jvm.gc`：垃圾回收练习包，用来理解 GC 行为和参数。
- `jvm.classloading`：类加载练习包，用来理解类加载过程和双亲委派。
- `thread`：线程基础练习包，放线程创建、启动、中断、状态等示例。
- `synchronizeddemo`：`synchronized` 关键字实验包。
- `volatiledemo`：`volatile` 关键字实验包。
- `lock`：显示锁练习包，比如 `ReentrantLock`、读写锁等。
- `threadpool`：线程池练习包，放参数配置、拒绝策略、任务提交实验。
- `completablefuture`：异步编排练习包，放 `CompletableFuture` 链式调用示例。
- `cas`：CAS 机制练习包，理解无锁并发的基础思想。
- `aqs`：AQS 练习包，理解锁和同步器底层抽象。
- `concurrentcollection`：并发容器练习包，比如 `ConcurrentHashMap`、阻塞队列。

## `boot-web`

- `controller`：接口入口，专门负责定义 REST API。
- `service`：业务接口层，描述系统对外提供的业务能力。
- `service.impl`：业务实现层，真正编写接口背后的逻辑。
- `dto`：请求参数对象，承接接口入参。
- `vo`：响应结果对象，组织返回数据。
- `config`：Spring MVC、统一返回、跨域等配置。
- `exception`：自定义异常和全局异常处理。
- `util`：少量工具方法。

## `boot-mybatis-mysql`

- `controller`：数据库练习模块的接口层。
- `service`：数据库业务能力定义。
- `service.impl`：数据库业务逻辑实现。
- `mapper`：MyBatis 数据访问接口。
- `entity`：数据库实体对象，通常和表结构较接近。
- `dto`：请求参数对象。
- `vo`：返回对象。
- `config`：数据源、MyBatis、事务等配置。
- `exception`：数据库模块自己的异常定义和处理。
- `resources/mapper`：MyBatis XML 映射文件目录。
- `resources/sql`：建表 SQL、初始化 SQL、实验 SQL 脚本目录。

## `boot-redis`

- `controller`：缓存相关接口入口。
- `service`：缓存业务接口定义。
- `service.impl`：缓存业务实现。
- `cache`：缓存操作包，放缓存读写、缓存策略相关代码。
- `lock`：分布式锁包，专门放锁实现和锁相关实验。
- `config`：Redis 配置、序列化配置等。
- `util`：Redis 模块辅助工具。

## `boot-async-task`

- `controller`：触发异步任务的接口入口。
- `service`：异步任务相关业务接口。
- `service.impl`：异步业务实现。
- `config`：异步线程池和异步支持配置。
- `executor`：执行器包，可以理解为线程池管理或任务执行器相关代码。
- `task`：具体任务包，放真正要异步执行的任务内容。
- `listener`：监听包，放异步事件监听、任务完成回调之类的逻辑。

## `boot-mq-pulsar`

- `producer`：消息生产者包，负责发送消息。
- `consumer`：消息消费者包，负责消费消息。
- `config`：Pulsar / TDMQ 连接和客户端配置。
- `model`：消息模型定义，比如消息体对象。
- `retry`：重试处理包，放失败重试相关逻辑。
- `idempotent`：幂等处理包，放防止重复消费的逻辑。
- `controller`：测试或触发消息发送的接口入口。

## `boot-quartz-scheduler`

- `controller`：调度管理接口层，比如新增任务、暂停任务、恢复任务。
- `service`：调度业务能力定义。
- `service.impl`：调度业务实现。
- `job`：Quartz 作业包，放真正执行的任务类。
- `trigger`：触发器相关包，放触发器组装、触发策略等逻辑。
- `config`：Quartz 配置包，放调度器、JobStore、线程池等配置。
- `model`：任务模型对象，比如任务参数、任务定义对象。
- `validator`：Cron 表达式和任务入参校验。
- `util`：调度工具方法。

## `playground-batch-processing`

- `paging`：分页扫描练习包，适合做“大表分批读取”实验。
- `chunk`：分块处理练习包，强调“每次处理一小批”。
- `batchinsert`：批量插入练习包。
- `batchupdate`：批量更新练习包。
- `retry`：失败重试练习包。
- `checkpoint`：断点续跑练习包，记录处理到哪里了。
- `queuebuffer`：队列缓冲练习包，适合模拟“先积攒再批量落库”。
- `processor`：处理器包，放核心处理流程或策略实现。

## `boot-integration-demo`

- `controller`：综合模块的接口入口。
- `service`：综合业务接口定义。
- `service.impl`：综合业务实现。
- `mapper`：数据库访问层。
- `entity`：数据库实体对象。
- `dto`：请求对象。
- `vo`：返回对象。
- `cache`：缓存相关逻辑。
- `mq`：消息队列相关逻辑。
- `task`：异步任务或调度任务相关逻辑。
- `config`：综合配置。
- `exception`：综合模块异常处理。

## `ops-devtools`

- `docker`：Docker 相关材料目录，比如 `Dockerfile`、镜像构建说明。
- `scripts`：脚本目录，比如启动脚本、打包脚本、辅助脚本。
- `linux`：Linux 命令和部署笔记目录。
- `docs`：工程化和排障相关文档目录。

## 怎么使用这份说明

- 看不懂某个包时，先来这里查中文含义。
- 如果后面模块新增了新包，建议你同步把中文说明补到这里。
- 真正写代码时，可以把这份文档当作“目录设计说明书”。
