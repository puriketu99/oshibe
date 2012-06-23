# --- First database schema
 
# --- !Ups
 
CREATE TABLE `aznable` (
  `id` int(11) unsigned NOT NULL auto_increment,
  `title` varchar(100) default NULL,
  `url` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

# --- !Downs
 
DROP TABLE IF EXISTS aznable;
