from mcp.server.fastmcp import FastMCP
mcp = FastMCP('Python-MCP-Server')
@mcp.tool()
def get_info_about(name : str) -> str:
    return {
        "first_name" : name,
        "last_name" : "Younes",
        "salary":17000,
        "email":"youn.ziani@edu.umi.ac.ma"
    }