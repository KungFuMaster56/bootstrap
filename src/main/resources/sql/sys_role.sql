CREATE TABLE [dbo].[sys_role] (
[id] int NOT NULL IDENTITY(1,1) ,
[role] varchar(50) COLLATE Chinese_PRC_CI_AS NULL ,
[description] varchar(50) COLLATE Chinese_PRC_CI_AS NULL ,
[available] varchar(2) COLLATE Chinese_PRC_CI_AS NULL ,
CONSTRAINT [PK__sys_role__3213E83F10216507] PRIMARY KEY ([id])
)
ON [PRIMARY]
GO

DBCC CHECKIDENT(N'[dbo].[sys_role]', RESEED, 2)
GO

INSERT INTO [heating].[dbo].[sys_role] ([id], [role], [description], [available]) VALUES ('1', 'admin', '管理员', '1');
INSERT INTO [heating].[dbo].[sys_role] ([id], [role], [description], [available]) VALUES ('2', 'vip', 'VIP会员', '1');
