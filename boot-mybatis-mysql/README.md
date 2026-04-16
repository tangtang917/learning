# boot-mybatis-mysql

## 模块目标
练 MySQL 和 MyBatis 主线，包括数据库连接、Mapper、分页、事务和 SQL 排查基础。

## 学习范围
- 数据源配置
- Mapper 与 XML
- 事务
- 分页
- SQL 基础优化
- 批量操作入门

## 包结构说明
- `controller`：数据库练习模块的接口层。
- `service`：数据库业务接口层。
- `service.impl`：数据库业务实现层。
- `mapper`：MyBatis 数据访问接口层。
- `entity`：数据库实体对象，通常和表结构接近。
- `dto`：请求对象。
- `vo`：返回对象。
- `config`：数据源、MyBatis、事务配置。
- `exception`：数据库模块自己的异常定义和处理。
- `resources/mapper`：MyBatis XML 映射文件目录。
- `resources/sql`：建表、初始化、实验 SQL 脚本目录。

## 学习资源
- [内部资源清单](../docs/resources/mysql-mybatis.md)
- [图解 MySQL](https://xiaolincoding.com/mysql/)
- [MyBatis 中文文档](https://mybatis.org/mybatis-3/zh_CN/getting-started.html)

## 练习任务
- [ ] 写单表 CRUD
- [ ] 加分页查询和事务实验
- [ ] 自己记录 3 个慢 SQL 优化点

## 笔记区
- SQL 优化结论：
- MyBatis 映射要点：
- 事务踩坑：

## 完成状态
- 状态：未开始
