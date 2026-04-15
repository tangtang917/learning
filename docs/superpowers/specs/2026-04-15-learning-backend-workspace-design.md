# Java Backend Learning Workspace Design

## 背景
当前工作区为空目录，目标是搭建一个偏学习练习的 Java 后端多模块仓库。仓库需要覆盖 Java 基础、算法、Spring Boot、MySQL、Redis、并发、异步、Quartz、Pulsar/TDMQ、批量处理、工程化等主题，并且每个模块都要有可直接打开学习的资源入口。

## 设计目标
- 保持模块边界清晰，避免一个大单体工程把所有技术混在一起。
- 把学习内容拆成独立子模块，支持分阶段推进。
- 每个模块都提供独立 `README.md`，方便直接查资源和做笔记。
- 在根目录保留统一的路线图、资源聚合和复盘模板。
- 为后续继续补充代码、配置、实验案例保留稳定目录结构。

## 核心结构
- 根工程 `learning-parent`：只做 Maven 聚合与版本管理。
- `common-core`：少量公共结构。
- `playground-*`：语言、算法、并发、批量处理实验场。
- `boot-*`：Spring Boot 主题模块。
- `ops-devtools`：运维与工程化材料。

## 模块列表
- `common-core`
- `playground-java-basics`
- `playground-algorithm`
- `playground-jvm-concurrency`
- `boot-web`
- `boot-mybatis-mysql`
- `boot-redis`
- `boot-async-task`
- `boot-mq-pulsar`
- `boot-quartz-scheduler`
- `playground-batch-processing`
- `boot-integration-demo`
- `ops-devtools`

## 依赖边界
- `playground-*` 不依赖业务模块。
- `boot-*` 模块尽量平行，避免过早深度耦合。
- `boot-integration-demo` 允许把数据库、缓存、调度、MQ 等主题串起来。
- `common-core` 只放少量基础能力，不能演变成垃圾桶模块。

## 文档策略
- 根目录 `README.md` 负责总导航。
- `docs/roadmap` 负责总览、阶段计划、检查清单。
- `docs/resources` 负责主题资源聚合。
- 每个子模块根目录下都放 `README.md`，包含模块目标、资源入口、练习任务、笔记区、完成状态。

## 技术基线
- Java 17
- Maven 3.9+
- Spring Boot 3.2.x
- MyBatis
- Redis
- Quartz
- Pulsar Java Client

## 自检结果
- 没有保留模糊模块边界。
- 已把异步、Quartz、批量处理拆成独立主题。
- 已把公司相关的 Pulsar/TDMQ、Quartz JDBC JobStore 场景纳入结构。
- 结构适合作为学习练习仓库，不会过早演变成大而全系统。

