TYPE=TRIGGERS
triggers='CREATE DEFINER=`root`@`localhost` TRIGGER `kurang_film` AFTER INSERT ON `films_out` FOR EACH ROW BEGIN\n	UPDATE films SET kuota_film = kuota_film - NEW.jumlah\n    WHERE id_film = NEW.id_film;\nEND'
sql_modes=1098907648
definers='root@localhost'
client_cs_names='utf8mb4'
connection_cl_names='utf8mb4_unicode_ci'
db_cl_names='utf8mb4_general_ci'
created=1669458196910485
