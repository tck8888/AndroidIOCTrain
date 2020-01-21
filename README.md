# android IOC 框架学习

## libannotation为各个模块提供注解

	1. idea工程
	2. 使用各个模块之前，需要运行本工程
	3. 执行安装到本地命令：gradlew clean install
	4. 位置在：C:\Users\tck\.m2\repository
	5. 其他各个模块可以调用

```
implementation "com.tck:libannotation:1.0.0"

repositories {
    mavenLocal()
}
```

## 学习ButterKnife
