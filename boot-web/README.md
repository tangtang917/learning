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
- [Spring Boot 中文文档入口](https://spring-boot.spring-doc.cn/)
- [构建 RESTful Web 服务](https://springframework.org.cn/guides/gs/rest-service/)

## 练习任务
- [ ] 写一个最小用户或商品 CRUD 接口
- [ ] 补参数校验与全局异常处理
- [ ] 用测试覆盖一个正常流程和一个异常流程

## 笔记区
- 接口设计经验：
- 校验与异常处理要点：
- 后续准备串联的点：

## 完成状态
- 状态：未开始
