CREATE TABLE [dbo].[sys_permission] (
[id] int NOT NULL IDENTITY(1,1) ,
[name] varchar(50) COLLATE Chinese_PRC_CI_AS NULL ,
[resource_type] varchar(50) COLLATE Chinese_PRC_CI_AS NULL ,
[url] varchar(255) COLLATE Chinese_PRC_CI_AS NULL ,
[permission] varchar(50) COLLATE Chinese_PRC_CI_AS NULL ,
[parent_id] int NULL ,
[parent_ids] int NULL ,
[available ] varchar(2) COLLATE Chinese_PRC_CI_AS NULL ,
CONSTRAINT [PK__sys_perm__3213E83F13F1F5EB] PRIMARY KEY ([id])
)
ON [PRIMARY]
GO

DBCC CHECKIDENT(N'[dbo].[sys_permission]', RESEED, 3)
GO

INSERT INTO [heating].[dbo].[sys_permission] ([id], [name], [resource_type], [url], [permission], [parent_id], [parent_ids], [available ]) VALUES ('1', '用户管理', 'menu', 'userInfo/userList', 'userInfo:view', '0', '0', '1');
INSERT INTO [heating].[dbo].[sys_permission] ([id], [name], [resource_type], [url], [permission], [parent_id], [parent_ids], [available ]) VALUES ('2', '用户添加', 'button', 'userInfo/userAdd', 'userInfo:add', '1', '0', '1');
INSERT INTO [heating].[dbo].[sys_permission] ([id], [name], [resource_type], [url], [permission], [parent_id], [parent_ids], [available ]) VALUES ('3', '用户删除', 'button', 'userInfo/userDel', 'userInfo:del', '1', '0', '1');
