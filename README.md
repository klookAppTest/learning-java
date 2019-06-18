# learning-java

### Java 开始

1、安装JDK 

下载地址：https://www.oracle.com/technetwork/java/javase/downloads/index.html

2、配置环境变量, ```sudo vi ~/.bash_profile```

```shell
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home
export CLASSPAHT=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
export PATH=$JAVA_HOME/bin:$PATH:
```

```source ~/.bash_profile``` 使环境变量生效。

3、安装 ```IntelliJ IDEA```， 请自行下载安装。

下载地址：https://www.jetbrains.com/idea/download/#section=mac

4、 通过 ```IntelliJ IDEA``` 创建 项目->包->类文件 ```hello.java```。

```java
package com.java.base;

public class hello {

    public static  void  main(String[] args){
        System.out.println("hello, java!");
    }
}
```

5、运行，在 ```IntelliJ IDEA``` 中，通过右键 类文件运行。

```shell
hello, java!
```

### Android开始

1、下载安装 ```android studio```

下载地址：https://developer.android.com/studio/

2、开始Android项目

官方文档：https://developer.android.google.cn/training/basics/firstapp/creating-project 

