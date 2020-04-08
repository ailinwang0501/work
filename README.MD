##工作平台

##资料
[Spring 文档](https://spring.io/guides)
[Spring web文档](https://spring.io/guides/gs/serving-web-content/)
[ES](https://elasticsearch.cn/)
[Github](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)
[Bootstrap](https://www.bootcss.com/)
[oAuth](https://developer.github.com/apps/managing-oauth-apps/)
[Spring Docs](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)
[Flyway ](https://flywaydb.org/getstarted/firststeps/maven)

##工具
[Github](https://desktop.github.com/)
[Visual Paradigm](https://www.visual-paradigm.com/cn/)
[Lombok](https://projectlombok.org/)

##快捷键
 command + 左键 跳转到 *.class
 alt + enter  import class 自动修复
 command + N  set and get
 command + alt +V 自动抽取变量
 shift + F6 重命名
 command + alt + o  自动移除无用的引入文件
 div.col-lg-9 + table 自动生成div
 Command＋Alt＋L    格式化代码
 
 ##get from BAIDU
 Command＋B     打开光标处的方法或者类
 Command＋C     复制
 Command＋D     复制行(直接复制到下一行)
 Command＋E     打开最近更改的代码
 Command＋F     查找
 
 command＋H     隐藏窗口
 Command＋J     自动代码,比如for循环(单独详细讲)
 command＋N     查找类(外部指创建文件)
 command＋O     打开文档（外部通用）
 Command＋R     替换 根据搜索提示最近的动作
 
 command＋S      保存文件
 command＋W      关闭现有窗口(不仅仅指IDEA窗口)
 Command＋Y      删除行
 command＋Tab    切换窗口
 Command＋左右键  快速至行尾、行首
 command+/       注释一行或着多行 //(注意这个要在语言是英文状态下)
 
 。
 Command＋Shift＋U  大小写转换
 Command＋Alt＋O    优化导入的类和包
 Command＋Shift＋Enter  自动结束代码，行末自动添加分号; 
 
 Ctrl＋空格键         中英切换;
 Ctrl＋Enter         出现生成get,set方法的界面
 Ctrl＋Alt+H         查看谁调用了该方法
 Ctrl＋Shift+/       注释/…/（注意这个要在语言是英文状态下）
 
 Alt＋Command＋左右键   快速回到上次修改的地方
 Alt+Command＋Z.      丢弃选中代码的修改(针对Git而言）
 Shift＋Command＋上下键 代码向上下移动
 
##github command##
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/ailinwang0501/work.git
git push -u origin master 


git pull //拉回远端内容
press ESC
input :x 
git push

## 脚本
```sql
create table USER
(
	ID INT auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN VARCHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
	primary key (ID)
);
```

```bash
mvn flyway:migrate
```

##Wrong table name or password
1. open H2 console
2. create user if not exists sa password '123';
3. alter user sa admin true;

##配置maven
1. 去Maven的官网下载安装包，以bin.zip结尾的，下载之后进行解压。
[maven org](https://maven.apache.org/download.cgi)

2. 打开终端，查看是否有.bash_profile文件（如果没有就创建）。
    编辑命令：vi ~/.bash_profile 
    创建命令：touch ~/.bash_profile 

3. 输入i进入插入模式: 输入maven（解压后的）所在的目录。
export M2_HOME=/Users/用户名/Programs/Apache/Maven/apache-maven-3.6.0
export PATH=$PATH:$M2_HOME/bin

4. 强制执行文件：source ~/.bash_profile

5. 在终端输入：mvn -v；如果出现maven的版本号即配置成功。


