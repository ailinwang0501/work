##工作平台

##资料
[Spring 文档](https://spring.io/guides)
[Spring web文档](https://spring.io/guides/gs/serving-web-content/)
[ES](https://elasticsearch.cn/)
[Github](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)
[Bootstrap](https://www.bootcss.com/)
[oAuth](https://developer.github.com/apps/managing-oauth-apps/)
[Spring Docs](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)

##工具
[Github](https://desktop.github.com/)
[Visual Paradigm](https://www.visual-paradigm.com/cn/)

##快捷键
 command + 左键 跳转到 *.class
 alt + enter  import class 自动修复
 command + N  set and get
 command + alt +V 自动抽取变量
 shift + F6 重命名
 command + alt + o  自动移除无用的引入文件
 
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

## 创建表脚本
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


