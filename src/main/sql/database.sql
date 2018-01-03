CREATE TABLE tb_user(
  `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` VARCHAR (120) NOT NULL COMMENT '用户名称',
  `password` VARCHAR (120) NOT NULL COMMENT '用户密码',
  `create_time` TIMESTAMP NOT NUll DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (user_id),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT ='用户表';
INSERT INTO
  tb_user(username,password)
VALUES
  ('111','222');

CREATE TABLE tb_manufacturer(
  `manufacturer_name` VARCHAR (120) NOT NULL COMMENT '厂家名称',
  `manufacturer_phone` INT NOT NULL COMMENT '厂家电话',
  PRIMARY KEY (manufacturer_name)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT ='生产厂家表';
INSERT INTO
  tb_manufacturer(manufacturer_name,manufacturer_phone)
VALUES
  ('小米公司','110'),
  ('苹果公司','120');
DELETE FROM tb_manufacturer WHERE manufacturer_name='小米公司';


DROP TABLE tb_commodity;
CREATE TABLE tb_commodity(
  `commodity_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `name` VARCHAR (120) NOT NULL COMMENT '商品名称',
  `create_time` TIMESTAMP NOT NUll DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `manufacturer_name` VARCHAR(120) COMMENT '生产厂家名称',
  `commodity_describe` VARCHAR (120) COMMENT '说明',
  `commodity_value` DOUBLE  COMMENT '价格' ,
  PRIMARY KEY (commodity_id),
  FOREIGN KEY (manufacturer_name) REFERENCES tb_manufacturer (manufacturer_name) ON DELETE  CASCADE,
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT ='商品表';

INSERT INTO
  tb_commodity(name,manufacturer_name,commodity_describe,commodity_value)
VALUES
  ('小米7','小米公司','无','3000'),
  ('ipad2','苹果公司','无','2000'),
  ('小米4','小米公司','无','1000');


CREATE TABLE tb_shopping_cart(
  `commodity_id` bigint NOT NULL COMMENT '商品Id',
  `user_id` bigint NOT NULL COMMENT '用户id',
  `create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
  `count` INT COMMENT '数量',
  `commodity_value` DOUBLE  COMMENT '价格',
  `commodity_name` VARCHAR (120) COMMENT '名称',
  PRIMARY KEY (commodity_id, user_id), /*联合主键：*/
  FOREIGN KEY (commodity_id) REFERENCES tb_commodity (commodity_id) ON DELETE  CASCADE
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT ='购物车表';

INSERT INTO
  tb_shopping_cart(commodity_id,user_id,count,commodity_value,commodity_name)
VALUES
  (1000,1000,1,3000,'小米7');

CREATE TABLE tb_order(
  `order_id` bigint NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` bigint NOT NULL COMMENT '用户id',
  `create_time` TIMESTAMP NOT NUll DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `order_value` DOUBLE  COMMENT '订单价格' ,
  PRIMARY KEY (order_id),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT ='订单表';


CREATE TABLE tb_order_commodity(
  `order_id` bigint NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `commodity_id` bigint NOT NULL COMMENT '产品id',
  `create_time` TIMESTAMP NOT NUll DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `commodity_value` DOUBLE COMMENT '单价',
  `count` INT COMMENT '产品数量',
  `order_value` DOUBLE  COMMENT '订单价格' ,
  PRIMARY KEY (order_id,commodity_id),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT ='订单明细表';



