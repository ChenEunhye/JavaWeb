create database `txt`;
use `txt`;

create table `users`(
`id` INT UNSIGNED AUTO_INCREMENT,
`tel` char(11),
`usr` nvarchar(20) NOT NULL unique,
`email` nvarchar(20) ,
`pwd` nvarchar(20) NOT NULL,
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into `users`(`tel`,`usr`,`email`,`pwd`) values('12345678901','1','1@edu.cn','123456');
insert into `users` (`tel`,`usr`,`email`,`pwd`) values('12345678901','2','2@edu.cn','123456');

create table `zhoubian`
(
`id` INT UNSIGNED AUTO_INCREMENT, 
`xinxi` nvarchar(200) not null,
`dizhi`  nvarchar(50),
`sort` int not null,
`jiage` Decimal not null,
`kucun`  int not null,
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into `zhoubian` (`xinxi`,`dizhi`,`sort`,`jiage`,`kucun`) values ('malboo txt 崔秀彬10cm玛琅玩偶 玛琅彬','images/wanou/1.jpg',1,72,100);
insert into `zhoubian` (`xinxi`,`dizhi`,`sort`,`jiage`,`kucun`) values ('malboo txt 崔然竣10cm玛琅玩偶 玛琅竣','images/wanou/2.jpg',1,72,0);
insert into `zhoubian` (`xinxi`,`dizhi`,`sort`,`jiage`,`kucun`) values ('malboo txt 崔杋圭10cm玛琅玩偶 玛琅圭','images/wanou/3.jpg',1,72,100);
insert into `zhoubian` (`xinxi`,`dizhi`,`sort`,`jiage`,`kucun`) values  ('malboo txt 姜太显10cm玛琅玩偶 玛琅显','images/wanou/4.jpg',1,72,100);
insert into `zhoubian` (`xinxi`,`dizhi`,`sort`,`jiage`,`kucun`) values ('malboo txt 休宁凯10cm玛琅玩偶 玛琅凯','images/wanou/5.jpg',1,72,100);
insert into `zhoubian` (`xinxi`,`dizhi`,`sort`,`jiage`,`kucun`) values ('99inmymind 手幅 崔然竣 应援场周','images/yingyuan/1.jpg',2,28,100);
insert into `zhoubian` (`xinxi`,`dizhi`,`sort`,`jiage`,`kucun`) values('txt 档应援棒馍仙灯MOA棒','images/yingyuan/2.jpg',2,268,100);
insert into `zhoubian` (`xinxi`,`dizhi`,`sort`,`jiage`,`kucun`) values ('【要补邮】TXT 日巡 快闪店 周边 TOMORROW X TOGETHER WORLD TOUR ＜ACT : SWEET MIRAGE＞ IN JAPAN 開催記念 POP-UP STORE','images/yingyuan/3.jpg',2,28,100);
insert into `zhoubian` (`xinxi`,`dizhi`,`sort`,`jiage`,`kucun`) values('【现货】txt拓麻歌子贴纸一期  A6亮膜 我知不退不换','images/yingyuan/4.jpg',2,268,100);


create table `hudong`
(
`id` INT UNSIGNED AUTO_INCREMENT,
`nicheng` nvarchar(200) not null,
`pinglun`  nvarchar(50),
`userid` int,
PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table `photo`
(
`id` int , 
`dizhi` nvarchar(200) not null,
`sort` int not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into `photo`(`id`,`dizhi`,`sort`) values ('1','images/cfg/1.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('2','images/crj/1.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('3','images/jtx/1.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('4','images/xnk/1.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('5','images/cxb/1.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('6','images/cxb/2.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('7','images/hz/1.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('8','images/hz/2.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('9','images/hz/3.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('10','images/hz/4.jpg','1');
insert into `photo`(`id`,`dizhi`,`sort`) values ('11','images/hz/5.jpg','1');









