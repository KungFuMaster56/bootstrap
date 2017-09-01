CREATE TABLE [dbo].[sys_role_permission] (
[role_id] int NULL ,
[permission_id] int NULL 
)
ON [PRIMARY]
GO

INSERT INTO [heating].[dbo].[sys_role_permission] ([role_id], [permission_id]) VALUES ('1', '1');
INSERT INTO [heating].[dbo].[sys_role_permission] ([role_id], [permission_id]) VALUES ('1', '2');
