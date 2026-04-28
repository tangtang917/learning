# boot-web

## 模块目标
练 Spring Boot Web 基础开发，包括 REST API、参数校验、统一异常处理、基础日志和简单测试。

## 学习范围
- Controller / Service 分层
- 参数校验
- 统一异常处理
- 返回对象设计
- 基础测试

## 包结构说明
- `controller`：接口入口层，负责接收 HTTP 请求和返回结果。
- `service`：业务接口层，定义模块要提供的能力。
- `service.impl`：业务实现层，真正编写业务逻辑。
- `dto`：请求对象，承接接口入参。
- `vo`：返回对象，组织响应数据。
- `config`：配置包，放 Web、校验、统一返回等配置。
- `exception`：异常包，放自定义异常和全局异常处理。
- `util`：工具包，放少量辅助方法。

## 学习资源
- [内部资源清单](../docs/resources/spring.md)
- 主线讲解：由当前学习仓库按课推进，每一课直接落代码和测试。
- 辅助教程：[程序员优雅哥：SpringBoot 2.7.2 实战基础分类](https://www.cnblogs.com/youyacoder/category/2197925.html)
- 第 1 课参考：[优雅哥：快速体验 Spring Boot 了解使用、运行和打包](https://www.cnblogs.com/youyacoder/p/16544627.html)
- 第 1 课参考：[Spring Boot REST API 最佳实践 第一章：实现 GET Collection API](https://springdoc.cn/spring-boot-rest-api-best-practices-part-1/)
- 第 2 课参考：[优雅哥：SpringBoot 如何集成 MyBatisPlus](https://www.cnblogs.com/youyacoder/p/16550998.html)
- 第 2 课参考：[Spring Boot REST API 最佳实践 第二章：实现 Create 和 Update API](https://springdoc.cn/spring-boot-rest-api-best-practices-part-2/)
- 速查资料：[Spring Boot 中文文档入口](https://spring-boot.spring-doc.cn/)

## 练习任务
- [x] 写一个最小 REST API，并用测试证明接口可用
- [ ] 写一个最小用户或商品 CRUD 接口
- [ ] 补参数校验与全局异常处理
- [ ] 用测试覆盖一个正常流程和一个异常流程

## 课程记录
- 第 1 课：Spring Boot Web 请求链路。当前接口为 `GET /api/hello?name=Codex`，返回 `{"message":"Hello, Codex"}`。
- 第 2 课：DTO / VO / Service 分层。当前接口为 `POST /api/products`，请求体使用 `CreateProductRequest`，业务逻辑进入 `ProductService`，响应使用 `ProductResponse`。

## 笔记区
- 接口设计经验：
- 校验与异常处理要点：
- 后续准备串联的点：

## 完成状态
- 状态：未开始
