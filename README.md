# Java 后端学习练习仓库

这是一个按技能点拆分的 `Maven` 多模块学习仓库，目标是把 Java 后端常见能力拆成独立练习单元，再通过综合模块把它们串起来。

## 技术基线
- Java `17`
- Maven `3.9+`
- Spring Boot `3.2.x`
- MyBatis
- Redis
- Quartz
- Apache Pulsar / TDMQ 学习适配

## 使用方式
1. 先看 [仓库总览](docs/roadmap/01-overview.md)。
2. 按 [阶段计划](docs/roadmap/02-phase-plan.md) 逐个推进模块。
3. 进入每个子模块的 `README.md`，直接使用模块内的资源链接、练习清单和笔记区。
4. 每周用 [周复盘模板](docs/notes/weekly-review-template.md) 做一次总结。

## 模块顺序
1. `playground-java-basics`
2. `playground-algorithm`
3. `boot-web`
4. `boot-mybatis-mysql`
5. `boot-redis`
6. `playground-jvm-concurrency`
7. `boot-async-task`
8. `boot-quartz-scheduler`
9. `boot-mq-pulsar`
10. `playground-batch-processing`
11. `boot-integration-demo`
12. `ops-devtools`

## 模块说明
- `common-core`：少量公共能力，避免重复定义基础结构。
- `playground-java-basics`：Java 基础、集合、IO、反射、Lambda、Stream。
- `playground-algorithm`：数据结构和算法。
- `playground-jvm-concurrency`：JVM、线程、锁、线程池、CompletableFuture。
- `boot-web`：Spring Boot Web、参数校验、统一异常处理。
- `boot-mybatis-mysql`：MySQL、事务、MyBatis、分页和 SQL 练习。
- `boot-redis`：缓存、分布式锁、缓存问题治理。
- `boot-async-task`：Spring 进程内异步、线程池、任务编排。
- `boot-mq-pulsar`：Pulsar/TDMQ 消息收发、重试、幂等。
- `boot-quartz-scheduler`：Quartz 动态调度、Cron、JDBC JobStore、集群配置。
- `playground-batch-processing`：批量插入、分批扫描、批消费、断点处理。
- `boot-integration-demo`：把 Web、DB、Redis、异步、MQ、调度串起来。
- `ops-devtools`：Docker、Linux、脚本、环境准备与排障文档。

## 文档导航
- [总览](docs/roadmap/01-overview.md)
- [阶段计划](docs/roadmap/02-phase-plan.md)
- [学习检查清单](docs/roadmap/03-checklist.md)
- [包结构中文说明](docs/roadmap/04-package-glossary.md)
- [资源目录](docs/resources)
- [设计说明](docs/superpowers/specs/2026-04-15-learning-backend-workspace-design.md)
- [实施计划](docs/superpowers/plans/2026-04-15-learning-backend-workspace-bootstrap.md)

## 约束
- 业务型模块尽量单主题，避免一开始就堆成大单体。
- 每个模块都保留自己的 `README.md`，作为学习入口与笔记入口。
- 综合模块只做串联，不做大而全业务系统。
- 如果后续要贴近公司旧项目，可以单独开 `java8-boot2` 分支，不污染当前主仓库结构。
