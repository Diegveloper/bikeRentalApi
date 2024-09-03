
DROP TABLE IF EXISTS bikes;
DROP SEQUENCE IF EXISTS bikes_id_seq;


CREATE SEQUENCE bikes_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 1000
    CACHE 1;


CREATE TABLE bikes (
    "id" int DEFAULT nextval('bikes_id_seq') NOT NULL,
    "name" varchar(100),
    "brand" varchar(100),
    "image" varchar(200),
    "description" varchar(1000),
    "units" int,
    "review" float8,
    PRIMARY KEY ("id")
);

INSERT INTO bikes ("id", "name", "brand", "image", "description", "units", "review") VALUES
 (2, 'Fuel EX', 'Trek', 'https://media.trekbikes.com/image/upload/f_auto,fl_progressive:semi,q_auto,w_800,h_600,c_pad/FuelEX5Deore_22_33073_B_Primary', 'Versatile mountain bike for all trails', 5, 4.5),
 (3, 'Bronson', 'Santa Cruz', 'https://thebikehood.com/cdn/shop/files/santa-cruz-bicycles-santa-cruz-bronson-41-c-2024-m.jpg?v=1691393675', 'All-mountain bike with superior handling', 4, 4.8),
 (4, 'Mach 5.5', 'Pivot', 'https://d2yn9m4p3q9iyv.cloudfront.net/pivot/2019/mach-5.5-carbon-team-xx1-axs/thumbs/1000/a4c78.jpeg', 'Trail bike with smooth suspension', 2, 4.7),
 (5, 'Ripmo', 'Ibis', 'https://d2yn9m4p3q9iyv.cloudfront.net/ibis/2023/ripmo-v2s-ngx/thumbs/1000/cdde5.webp', 'Enduro bike built for aggressive riding', 6, 4.6),
 (6, 'Reign', 'Giant', 'https://images2.giant-bicycles.com/b_white%2Cc_pad%2Ch_600%2Cq_80%2Cw_800/kkk7xplvys6vvu3dshgp/MY24Reign1_ColorABlueDragonfly_Black.jpg', 'Enduro machine with plush travel', 3, 4.4),
 (7, 'Spectral', 'Canyon', 'https://www.canyon.com/dw/image/v2/BCML_PRD/on/demandware.static/-/Sites-canyon-master/default/dw556a54a5/images/full/full_2023_/2023/full_2023_3506_spectral-cf-8-cllctv-kis_gy-gy_P5.png', 'Trail bike with agile handling', 4, 4.5),
 (8, 'Slash', 'Trek', 'https://media.trekbikes.com/image/upload/f_auto,fl_progressive:semi,q_auto,w_800,h_600,c_pad/Slash8-24-41668-A-Primary', 'Enduro bike designed for speed', 3, 4.7),
 (9, 'Altitude', 'Rocky Mountain', 'https://cuadro.cc/cdn/shop/products/alloy30altitude_ed4a8501-9eda-4a10-b7dd-52436c7f8110.webp?v=1693873833', 'All-rounder with advanced suspension', 2, 4.6),
 (10, 'SB130', 'Yeti', 'https://cdn11.bigcommerce.com/s-5zdahzyh66/images/stencil/1000w/products/2792/98850/5f5f49a9608f9b4d218a9fc1439fc3d6ef35f7cf2e8060df9b9b4e3df82dc505__68255.1677808464.386.513.jpg?c=2', 'Trail bike with progressive geometry', 5, 4.9),
 (11, 'Tracer', 'Intense', 'https://cdn.shoplightspeed.com/shops/620181/files/26100575/intense-tracer-275er-expert.jpg', 'Enduro bike with aggressive stance', 3, 4.7),
 (12, 'Process 153', 'Kona', 'https://www.konaworld.com/cdn/shop/products/my22_process_153_275.jpg?v=1677095981&width=2048', 'Enduro bike with balanced geometry', 6, 4.5),
 (13, 'Jeffsy', 'YT Industries', 'https://cdn-prod.yt-industries.com/media/image/ca/b5/a7/JEFFSY-MK3-CF-Core4-CrimsonRed-Front_wEXXNJ0KkCSyic.png', 'Trail bike for technical descents', 4, 4.8),
 (14, 'Patrol', 'Transition', 'https://creekcave.com/cdn/shop/files/618e26f5cf2495cddbb23ae42e7be8f7_720x_c4142c30-b90c-4ae8-a95c-29445b05586f.webp?v=1684862858&width=720', 'Enduro bike with progressive suspension', 2, 4.6),
 (15, 'Megatower', 'Santa Cruz', 'https://thebikehood.com/cdn/shop/files/38afb_ef70152e-18b8-4620-9dc1-fec0ad467492.jpg?v=1691394397', 'Enduro bike with long-travel capability', 3, 4.7),
 (16, 'Instinct', 'Rocky Mountain', '', 'Trail bike for all-day adventures', 5, 4.6),
 (17, 'Rallon', 'Orbea', '', 'Enduro bike with modern geometry', 4, 4.7),
 (18, 'SB150', 'Yeti', '', 'Enduro bike with top-notch performance', 2, 4.9),
 (19, 'Strive', 'Canyon', '', 'Enduro bike with race-ready geometry', 3, 4.8),
 (20, 'Nomad', 'Santa Cruz', '', 'Enduro bike for aggressive riders', 5, 4.7),
 (21, 'Enduro', 'Specialized', '', 'High-performance enduro bike', 4, 4.8);
