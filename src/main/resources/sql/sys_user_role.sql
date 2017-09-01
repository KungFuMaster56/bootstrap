CREATE TABLE [dbo].[sys_user_role] (
[user_id] int NULL ,
[role_id] int NULL 
)
ON [PRIMARY]
GO

INSERT INTO [heating].[dbo].[sys_user_role] ([user_id], [role_id]) VALUES ('1', '1');
INSERT INTO [heating].[dbo].[sys_user_role] ([user_id], [role_id]) VALUES ('1', '2');
