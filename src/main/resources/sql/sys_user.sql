CREATE TABLE [dbo].[sys_user] (
[id] int NOT NULL IDENTITY(1,1) ,
[username] varchar(50) COLLATE Chinese_PRC_CI_AS NULL ,
[name] varchar(50) COLLATE Chinese_PRC_CI_AS NULL ,
[password] varchar(255) COLLATE Chinese_PRC_CI_AS NULL ,
[salt] varchar(255) COLLATE Chinese_PRC_CI_AS NULL ,
[state] int NULL ,
CONSTRAINT [PK__sys_user__3213E83F0C50D423] PRIMARY KEY ([id]),
CONSTRAINT [unique_username] UNIQUE ([username] ASC)
)
ON [PRIMARY]
GO

DBCC CHECKIDENT(N'[dbo].[sys_user]', RESEED, 5)
GO

INSERT INTO [heating].[dbo].[sys_user] ([id], [username], [name], [password], [salt], [state]) VALUES ('1', 'admin', '管理员', '123456', '8d78869f470951332959580424d4bf4f', '0');
INSERT INTO [heating].[dbo].[sys_user] ([id], [username], [name], [password], [salt], [state]) VALUES ('5', 'user', '用户', '111', NULL, NULL);
