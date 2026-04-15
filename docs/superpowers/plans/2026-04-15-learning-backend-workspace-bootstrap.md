# Learning Workspace Bootstrap Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Build a Maven multi-module Java backend learning workspace with module docs, resource hubs, and starter configuration files.

**Architecture:** Use a root aggregator POM for shared version management and create independent child modules for each skill area. Put learning navigation in root docs and put a module-specific README in every child module so the workspace is usable before any real business code is added.

**Tech Stack:** Maven, Java 17, Spring Boot 3.2.x, MyBatis, Redis, Quartz, Apache Pulsar client, Markdown docs

---

### Task 1: Create the root aggregator and shared documentation

**Files:**
- Create: `pom.xml`
- Create: `README.md`
- Create: `docs/roadmap/01-overview.md`
- Create: `docs/roadmap/02-phase-plan.md`
- Create: `docs/roadmap/03-checklist.md`
- Create: `docs/resources/*.md`
- Create: `docs/notes/*.md`

- [ ] **Step 1: Define the root Maven POM**

```xml
<packaging>pom</packaging>
<modules>
    <module>common-core</module>
    <module>playground-java-basics</module>
    <module>playground-algorithm</module>
    <module>playground-jvm-concurrency</module>
    <module>boot-web</module>
    <module>boot-mybatis-mysql</module>
    <module>boot-redis</module>
    <module>boot-async-task</module>
    <module>boot-mq-pulsar</module>
    <module>boot-quartz-scheduler</module>
    <module>playground-batch-processing</module>
    <module>boot-integration-demo</module>
    <module>ops-devtools</module>
</modules>
```

- [ ] **Step 2: Write the root navigation README**

```md
## 使用方式
1. 先看 docs/roadmap/01-overview.md
2. 按阶段计划逐个推进模块
3. 进入每个子模块的 README.md 学习和做笔记
```

- [ ] **Step 3: Write roadmap and resource documents**

```md
# 阶段计划
## 第一阶段：语言与基础
## 第二阶段：后端主线
## 第三阶段：进阶能力
## 第四阶段：综合练习与工程化
```

- [ ] **Step 4: Verify files exist**

Run: `Get-ChildItem -Recurse docs`

Expected: all roadmap, resources, and notes files are present.

### Task 2: Create child module POMs and per-module README files

**Files:**
- Create: `common-core/pom.xml`
- Create: `common-core/README.md`
- Create: `playground-java-basics/pom.xml`
- Create: `playground-java-basics/README.md`
- Create: `playground-algorithm/pom.xml`
- Create: `playground-algorithm/README.md`
- Create: `playground-jvm-concurrency/pom.xml`
- Create: `playground-jvm-concurrency/README.md`
- Create: `boot-web/pom.xml`
- Create: `boot-web/README.md`
- Create: `boot-mybatis-mysql/pom.xml`
- Create: `boot-mybatis-mysql/README.md`
- Create: `boot-redis/pom.xml`
- Create: `boot-redis/README.md`
- Create: `boot-async-task/pom.xml`
- Create: `boot-async-task/README.md`
- Create: `boot-mq-pulsar/pom.xml`
- Create: `boot-mq-pulsar/README.md`
- Create: `boot-quartz-scheduler/pom.xml`
- Create: `boot-quartz-scheduler/README.md`
- Create: `playground-batch-processing/pom.xml`
- Create: `playground-batch-processing/README.md`
- Create: `boot-integration-demo/pom.xml`
- Create: `boot-integration-demo/README.md`
- Create: `ops-devtools/pom.xml`
- Create: `ops-devtools/README.md`

- [ ] **Step 1: Create minimal child POMs**

```xml
<parent>
    <groupId>com.learning</groupId>
    <artifactId>learning-parent</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <relativePath>../pom.xml</relativePath>
</parent>
```

- [ ] **Step 2: Add module-specific dependencies**

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
</dependency>
```

- [ ] **Step 3: Add module README files with resources and note sections**

```md
## 学习资源
- 内部资源：../docs/resources/spring.md
- 外部资源：Spring Boot 中文文档

## 笔记区
- 关键概念：
- 易错点：
```

- [ ] **Step 4: Verify module files exist**

Run: `Get-ChildItem -Directory | ForEach-Object { Get-ChildItem $_.FullName -Filter README.md }`

Expected: every module directory returns a README file.

### Task 3: Add starter configuration files for Spring Boot modules

**Files:**
- Create: `boot-web/src/main/resources/application.yml`
- Create: `boot-mybatis-mysql/src/main/resources/application.yml`
- Create: `boot-redis/src/main/resources/application.yml`
- Create: `boot-async-task/src/main/resources/application.yml`
- Create: `boot-mq-pulsar/src/main/resources/application.yml`
- Create: `boot-quartz-scheduler/src/main/resources/application.yml`
- Create: `boot-integration-demo/src/main/resources/application.yml`

- [ ] **Step 1: Write minimal app names and ports**

```yaml
spring:
  application:
    name: boot-web
server:
  port: 8080
```

- [ ] **Step 2: Add focused placeholders by module**

```yaml
spring:
  quartz:
    job-store-type: jdbc
    properties:
      org:
        quartz:
          jobStore:
            class: org.quartz.impl.jdbcjobstore.JobStoreTX
            isClustered: true
```

- [ ] **Step 3: Verify config files exist**

Run: `Get-ChildItem -Recurse -Filter application.yml`

Expected: all Spring Boot modules contain one configuration file.

### Task 4: Validate the workspace structure

**Files:**
- Validate: `pom.xml`
- Validate: all child `pom.xml`
- Validate: all `README.md`

- [ ] **Step 1: Run Maven validation**

Run: `mvn -q -DskipTests validate`

Expected: exit code `0`

- [ ] **Step 2: Inspect the generated module tree**

Run: `Get-ChildItem -Directory | Select-Object Name`

Expected: the root displays all planned modules.

- [ ] **Step 3: Record any blocked verification**

```text
If Maven cannot download dependencies in the current sandbox, record the failure mode and keep the file structure evidence.
```

## Self-review
- Spec coverage checked: root docs, child module docs, POMs, and starter configs all mapped to tasks.
- Placeholder scan checked: no TODO markers remain in executable steps.
- Type consistency checked: all module names, file names, and core dependency names match the agreed design.

## Execution note
Inline execution was chosen in the current conversation after the design was approved.
