CREATE TABLE `ksd_user_0`
(
    `id`       bigint(20) NOT NULL AUTO_INCREMENT,
    `nickname` varchar(20) DEFAULT NULL,
    `age`      tinyint(4) DEFAULT NULL,
    `password` varchar(20) DEFAULT NULL,
    `sex`      tinyint(4) DEFAULT NULL,
    `birthday` datetime    DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


CREATE TABLE `ksd_user_1`
(
    `id`       bigint(20) NOT NULL AUTO_INCREMENT,
    `nickname` varchar(20) DEFAULT NULL,
    `age`      tinyint(4) DEFAULT NULL,
    `password` varchar(20) DEFAULT NULL,
    `sex`      tinyint(4) DEFAULT NULL,
    `birthday` datetime    DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE `ksd_order_0`
(
    `order_id`     bigint(20) NOT NULL AUTO_INCREMENT,
    `order_number` varchar(32) DEFAULT NULL,
    `user_id`      bigint(20) DEFAULT NULL,
    `product_id`   bigint(20) DEFAULT NULL,
    `create_time`  datetime    DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `ksd_order_1`
(
    `order_id`     bigint(20) NOT NULL AUTO_INCREMENT,
    `order_number` varchar(32) DEFAULT NULL,
    `user_id`      bigint(20) DEFAULT NULL,
    `product_id`   bigint(20) DEFAULT NULL,
    `create_time`  datetime    DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `ksd_user_order_202101`
(
    `order_id`     BIGINT (20) NOT NULL AUTO_INCREMENT,
    `order_number` VARCHAR(32) DEFAULT NULL,
    `user_id`      BIGINT (20) DEFAULT NULL,
    `yearmonth`    VARCHAR(30) DEFAULT NULL,
    `create_time`  datetime    DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `ksd_user_order_202102`
(
    `order_id`     BIGINT (20) NOT NULL AUTO_INCREMENT,
    `order_number` VARCHAR(32) DEFAULT NULL,
    `user_id`      BIGINT (20) DEFAULT NULL,
    `yearmonth`    VARCHAR(30) DEFAULT NULL,
    `create_time`  datetime    DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `ksd_user_order_202103`
(
    `order_id`     BIGINT (20) NOT NULL AUTO_INCREMENT,
    `order_number` VARCHAR(32) DEFAULT NULL,
    `user_id`      BIGINT (20) DEFAULT NULL,
    `yearmonth`    VARCHAR(30) DEFAULT NULL,
    `create_time`  datetime    DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;



CREATE TABLE `ksd_user_order_202201`
(
    `order_id`     BIGINT (20) NOT NULL AUTO_INCREMENT,
    `order_number` VARCHAR(32) DEFAULT NULL,
    `user_id`      BIGINT (20) DEFAULT NULL,
    `yearmonth`    VARCHAR(30) DEFAULT NULL,
    `create_time`  datetime    DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `ksd_user_order_202202`
(
    `order_id`     BIGINT (20) NOT NULL AUTO_INCREMENT,
    `order_number` VARCHAR(32) DEFAULT NULL,
    `user_id`      BIGINT (20) DEFAULT NULL,
    `yearmonth`    VARCHAR(30) DEFAULT NULL,
    `create_time`  datetime    DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `ksd_user_order_202203`
(
    `order_id`     BIGINT (20) NOT NULL AUTO_INCREMENT,
    `order_number` VARCHAR(32) DEFAULT NULL,
    `user_id`      BIGINT (20) DEFAULT NULL,
    `yearmonth`    VARCHAR(30) DEFAULT NULL,
    `create_time`  datetime    DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`order_id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;